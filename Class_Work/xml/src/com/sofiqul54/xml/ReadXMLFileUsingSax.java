package com.sofiqul54.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFileUsingSax {

    public static void main(String[] args){
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean bfname = false;
                boolean bsalary = false;

                @Override
                public void startElement(String uri, String localName, String qName,
                        Attributes attributes) throws SAXException {
                    System.out.println("Start Element :" + qName);
                    if (qName.equalsIgnoreCase("FULLNAME")) {
                        bfname = true;
                    }
                    if (qName.equalsIgnoreCase("SALARY")) {
                        bsalary = true;
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("End Element :" + qName);
                }

                public void characters(char ch[], int start, int length) throws SAXException {
                    if (bfname) {
                        System.out.println("Full Name :" + new String(ch, start, start));
                        bfname = false;
                    }
                    if (bsalary) {
                        System.out.println("Salary :" + new String(ch, start, start));
                        bsalary = false;
                    }
                }
            };
            
            saxParser.parse("E:\\J2EE_ALL_(OWN)\\Git_Own\\JavaSwing\\Class_Work\\xml\\src\\com\\sofiqul54\\xml/staff.xml", handler);
        } catch (Exception e) {
           // e.printStackTrace();
        }
    }
}
