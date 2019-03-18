
public class Identifier {
	private String attributeValue;
	protected static int totalIdentifier = 0;
	private String identifier ;
	private String identifierName;
	

	public Identifier(String attributeValue, String identifier, String identifierName) {
		
		this.attributeValue = attributeValue;
		this.identifier = identifier;
		this.identifierName = identifierName;
		totalIdentifier++;
	}
	
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	public static void setTotalIdentifier(int totalIdentifier) {
		Identifier.totalIdentifier = totalIdentifier;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifierName() {
		return identifierName;
	}

	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	
}
