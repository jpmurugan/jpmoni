package com.runner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="E:\\Cucumber\\src\\test\\resources\\Features\\Pb.feature" , glue="com.definitionss")

public class TestRunner {
	

}
