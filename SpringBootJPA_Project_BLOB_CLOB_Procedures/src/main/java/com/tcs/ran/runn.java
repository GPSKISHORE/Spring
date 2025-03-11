package com.tcs.ran;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.tcs.enty.Enty;
import com.tcs.serv.Iserve;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class runn implements CommandLineRunner {
	@Autowired
	private Iserve se;

	@Override
	public void run(String... args) throws Exception {
		Enty e = new Enty();
		e.setDateOfJoining(LocalDate.of(2025, 03, 06));
		e.setTimeOfJoining(LocalTime.of(10, 37));
		
		InputStream is = new FileInputStream("‪C:/Users/gpski/Downloads/Kishore/Kishore_image.jpg".trim().replace("\u200E", "").replace("\u200F", "").replace("\u202A", "").replace("\u202C", ""));
		byte[] b = new byte[is.available()];
		b = is.readAllBytes();
		
		String Resume_Path = "C:/Users/gpski/Downloads/Kishore/Resumes/Job Hunt DEC/PAVAN_SAI_KISHORE_RESUME_Feb.pdf";
		Reader rr = new FileReader(Resume_Path);
		File f = new File(Resume_Path);
		char[] ch = new char[(int) f.length()];
		rr.read(ch);
		e.setResume(ch);
		e.setProfielPicture(b);
		e.setResumePath(Resume_Path);
		System.out.println(se.insrtToDB(e));
		rr.close();
		is.close();
	}

}
