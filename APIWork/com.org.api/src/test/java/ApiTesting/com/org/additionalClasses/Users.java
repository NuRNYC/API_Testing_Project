
package ApiTesting.com.org.additionalClasses;


public class Users {
	
	private String name;
	private String username;
	private String email;
	private Address address;
	private Geo geo;
	private String phone;
	private String website;
	private Company company;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		
		this.address=address;
		
	}
	
	public Geo getGeo() {
		return geo;
	}
	
	public void setGeo(Geo geo) {
		
		this.geo=geo;
		
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	

	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		
		this.company=company;
		
	}

}