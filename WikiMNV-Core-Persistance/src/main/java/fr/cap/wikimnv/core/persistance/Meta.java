package fr.cap.wikimnv.core.persistance;

public class Meta {

	String key, value;

	public Meta() {
		super();
	}
	
	
	public Meta(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String getValue() {return value;}
	public void setValue(String value) {this.value = value;}
	public String getKey() {return key;}
	public void setKey(String key) {this.key = key;}	
}