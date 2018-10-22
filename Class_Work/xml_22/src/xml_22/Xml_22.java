package xml_22;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml_22 {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);
            
            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);
            
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);
            
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Sofiqul"));
            staff.appendChild(firstname);
            
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Islam"));
            staff.appendChild(lastname);
            
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("Sofiq"));
            staff.appendChild(nickname);
            
             Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("50,000"));
            staff.appendChild(salary);
            
            
            
            
            
        } catch (Exception e) {
        }
 
    }

}
