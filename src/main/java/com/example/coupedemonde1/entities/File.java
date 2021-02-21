package com.example.coupedemonde1.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "files")
public class File {

	  @Id
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String id;
	
	  private String name;
	  private String type;
	  @Lob
	  private byte[] data;
	  
	  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "image")
	  private Arbitre arbitre;
	  
	  public File() {
		  super();
	  }
	
	  public File(String name, String type, byte[] data) {
			super();
			this.name = name;
			this.type = type;
			this.data = data;
	  }
	
	  
	  
	  public Arbitre getArbitre() {
		return arbitre;
		}
	
	
	
		public void setArbitre(Arbitre arbitre) {
			this.arbitre = arbitre;
		}
	
		public void setId(String id) {
			this.id = id;
		}
		public String getId() {
		  return id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getType() {
	    return type;
	  }

	  public void setType(String type) {
	    this.type = type;
	  }

	  public byte[] getData() {
	    return data;
	  }

	  public void setData(byte[] data) {
	    this.data = data;
	  }
}
