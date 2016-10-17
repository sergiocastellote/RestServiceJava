package jaxb;

import javax.xml.bind.annotation.XmlElement;

public class MyJaxBean {
	@XmlElement public String name;
    @XmlElement public String surname;
}
