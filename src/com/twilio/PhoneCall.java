package com.twilio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.voice.Say;



public class PhoneCall extends HttpServlet {

	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {

		Dial dial = new Dial.Builder("+917842674479").build();

		Say say = new Say.Builder("Goodbye!").build();
		VoiceResponse response1 = new VoiceResponse.Builder().dial(dial).say(say).build();
		PrintWriter result = response.getWriter();
		result.println(response1.toXml());
		/*
		  PrintWriter result=response.getWriter(); result.println("Hello Twilio");
		 */
	}
}