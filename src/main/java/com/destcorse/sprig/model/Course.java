package com.destcorse.sprig.model;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.validation.constraints.Size;
@Entity
/*@Table(name="Course")
@SecondaryTable(name="destination")*/
public class Course  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Size(max = 100)
    @Column(unique = true)
	private String name;
    
	private double distance;

   /* @Size(max = 100)
    @Column(unique = true)
	private String litenraire;

	private double distance;

    private long lgtitudeOne;

    private long lititudeOne;
	
    private long lgtitudeTwo;

    private long lititudeTwo;*/
   
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
	@JoinTable(name = "dest_cor", joinColumns = {
			@JoinColumn(name = "dest_id")},inverseJoinColumns = {
					@JoinColumn(name = "course_id" )})
	private Set<Destination> dest= new HashSet<Destination>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Set<Destination> getDest() {
		return dest;
	}

	public void setDest(Set<Destination> dest) {
		this.dest = dest;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String name, double distance) {
		super();
		this.name = name;
		this.distance = distance;
	}

	
	
	/*
	

	public void setDestination(Set<Destination> destination) {
		this.dest= destination;
	}

	public Course() {
		super();
	}
	
	public Course(Long courseId, String route, String litenraire, double distance, long lgtitudeOne, long lititudeOne,
			long lgtitudeTwo, long lititudeTwo, Destination destination) {
		super();
		this.courseId = courseId;
		this.route = route;
		this.litenraire = litenraire;
		this.distance = distance;
		this.lgtitudeOne = lgtitudeOne;
		this.lititudeOne = lititudeOne;
		this.lgtitudeTwo = lgtitudeTwo;
		this.lititudeTwo = lititudeTwo;
		
	}

	@Id
	@GeneratedValue
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getRoute() {
		return route;
	}
	
	public void setRoute(String route) {
		this.route = route;
	}

	public String getLitenraire() {
		return litenraire;
	}

	public void setLitenraire(String litenraire) {
		this.litenraire = litenraire;
	}
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	

	public long getLgtitudeOne() {
		return lgtitudeOne;
	}

	public void setLgtitudeOne(long lgtitudeOne) {
		this.lgtitudeOne = lgtitudeOne;
	}

	public long getLititudeOne() {
		return lititudeOne;
	}

	public void setLititudeOne(long lititudeOne) {
		this.lititudeOne = lititudeOne;
	}

	public long getLgtitudeTwo() {
		return lgtitudeTwo;
	}

	public void setLgtitudeTwo(long lgtitudeTwo) {
		this.lgtitudeTwo = lgtitudeTwo;
	}

	public long getLititudeTwo() {
		return lititudeTwo;
	}

	public void setLititudeTwo(long lititudeTwo) {
		this.lititudeTwo = lititudeTwo;
	}

	public double calculDistance() {
		Scanner scan = new Scanner(System.in);
	    DecimalFormat dcforma = new DecimalFormat("0.##");
	    
	    this. lgtitudeOne = 0;
		this. lititudeOne=0;
		this.lgtitudeTwo=0;
		this.lititudeTwo=0;
		
		//input
	    System.out.println("please enter depart1");
	    this.lgtitudeOne= scan.nextInt();
	    System.out.println("please enter depar2");
	    this.lgtitudeTwo= scan.nextInt();
	    System.out.println("please enter arrive1");
	      this.lititudeOne= scan.nextInt();
	    System.out.println("please enter arrive2");
           this.lititudeTwo= scan.nextInt();
	          scan.close();
	          
	     this.distance = Math.sqrt(Math.pow(lgtitudeTwo-lgtitudeOne, 2) + (Math.pow(lititudeTwo-lititudeOne, 2)));
	  	    
	  	    System.out.println("the distance is" + dcforma.format(distance));
		
	  	    
	  	    return distance;
	}
	
	
	
	
	
	*/

}
