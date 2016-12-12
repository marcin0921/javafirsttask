package com.marcin.training;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="zoo")
public class ZooFromXML {
    private String namePL;
    private String nameEN;

    private List<ZooFromXML> zooFromXML = new ArrayList<ZooFromXML>();

    @XmlElements(@XmlElement(name="zwierze"))
    public List<ZooFromXML> getZooFromXML() {
        return zooFromXML;
    }

    @XmlAttribute(name="nazwaPL")
    public String getNamePL() {
        return namePL;
    }

    public void setNamePL(String namePL) {
        this.namePL = namePL;
    }

    @XmlAttribute(name="nazwaEN")
    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }



}
