package api;

public class ItemAPI {
    private int id;
    private double price;
    private String name;
    private String description;

    public ItemAPI() {
        super();
    }
    
    public ItemAPI(int id, double price, String name, String description) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}



	/**
     * return a String representation of the object state
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("# ").append(id);
        sb.append(" $ ").append(price);
        sb.append(" ").append(name);
        sb.append(" '").append(description).append("'");
        
        return sb.toString();
    }

    /**
     * (TO BE COMPLETED BY STUDENT)
     */
    
    //Getters and setters
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}    
}
