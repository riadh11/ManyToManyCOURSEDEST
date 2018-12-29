package com.destcorse.sprig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.destcorse.sprig.model.Course;
import com.destcorse.sprig.model.Destination;
import com.destcorse.sprig.repository.CourseRepository;
import com.destcorse.sprig.repository.DestinationRepository;


/*@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling*/
@SpringBootApplication
public class TestCorseDest implements CommandLineRunner {
          
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private DestinationRepository destinationRepository;

    public static void main(String[] args) {
		SpringApplication.run(TestCorseDest.class, args);
    }

    public void run(String... args) throws Exception {
        // Cleanup the tables
    	//courseRepository.deleteAllInBatch();
        //destinationRepository.deleteAllInBatch(); 


        // Create Two Course 
        Course c1 = new  Course("dakar",1000);
        Destination d1 =new Destination("Dakar");
        Destination d2 =new Destination("Ribat");
        c1.getDest().add(d1);
        c1.getDest().add(d2);
       /* c1.setRoute("Rkm1");
        c1.setLitenraire("A Voiture");
        c1.setLititudeOne((long)23.65);
        c1.setLgtitudeOne((long) 65.23);
        c1.setLititudeTwo((long)56.78);
        c1.setLgtitudeTwo((long)89.56);
        
        c1.calculDistance();
        
        Course c2 = new  Course();
        c2.setRoute("Rkm2");
        c2.setLitenraire("A Velo");
        c2.setLititudeOne((long)25.65);
        c2.setLgtitudeOne((long) 39.23);
        c2.setLititudeTwo((long)52.78);
        c2.setLgtitudeTwo((long)92.56);
        
        c2.calculDistance();
     // Create Two Destination
        Destination D1 =new Destination();
        D1.setVille("SIDI BOUZID");
        D1.setAdress("cite ACHLAw Tun");
        D1.setDepart("MEZZOUNA");
        D1.setArrive("DOUZ");
        
        Destination D2 =new Destination();
        D2.setVille("Kasrine");
        D2.setAdress("cite Kasr Tun");
        D2.setDepart("kasr1");
        D2.setArrive("kasr2");
        
        //Add Course a reference in the  destination
        D1.getCourse().add(c1);
        D1.getCourse().add(c2);
        D2.getCourse().add(c1);
        D2.getCourse().add(c2);
        //add destination a reference in the Course
        c1.getDestination().add(D1);
        c1.getDestination().add(D2);
        c2.getDestination().add(D1);
        c2.getDestination().add(D2);*/
        
        courseRepository.save(c1);
        /*destinationRepository.save(D2);
        courseRepository.save(c1);
        courseRepository.save(c2);*/
        
        
    }      
}
        
        
        
        
        
        
        
        
        
        
       