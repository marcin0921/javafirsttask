package com.marcin.training;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class TestJAXB {

    public static void main(String... arg) throws Exception {
        File file = new File("src/com/marcin/training/data.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(ZooFromXML.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        ZooFromXML zooFromXML = (ZooFromXML) jaxbUnmarshaller.unmarshal(file);

        System.out.println("Nazwa PL: " + zooFromXML.getNamePL());
        System.out.println("Nazwa EN: " + zooFromXML.getNameEN());
        for (ZooFromXML zooFromXML1 : zooFromXML.getZooFromXML()) {
            System.out.println("Nazwa PL: " + zooFromXML.getNamePL() + ", Nazwa EN: " + zooFromXML.getNameEN());
        }
    }
}