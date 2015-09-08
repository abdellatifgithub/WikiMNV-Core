
package fr.cap.wikimnv.logmanager;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour logLevel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="logLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFO"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="DEBUG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "logLevel")
@XmlEnum
public enum LogLevel {

    INFO,
    WARN,
    ERROR,
    DEBUG;

    public String value() {
        return name();
    }

    public static LogLevel fromValue(String v) {
        return valueOf(v);
    }

}
