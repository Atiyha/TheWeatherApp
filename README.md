Atiyha Haripersadh
ST10440871
https://github.com/Atiyha/TheWeatherApp.git
In this Practicum I started off by creating in introduction page which leads to the main usage page.
 
 

I then designed and coded for the Main page
 
I made sure to design it in a way that made it look sophisticated. I ensured that there were multiple ways to input the specific forms of data needed. 
 
 

 

By declaring the properties as private, it allows for it to be easily assessed within the class.
I also created a data class with properties for day minimum temperature, maximum temperature and it implements the ‘serializable interface

I then further went on to create the last screen mainly used for displaying. 
 


 

Here I displayed weather data. It retrieves weather data from the previous activity through an intent. It also calculates the maximum and minimum temperatures. It updates two Text Views simultaneously.

0.	Start
1.	Declare variables for page 1
2.	Initialize UI elements 
3.	Link to page two
4.	Declare variables for page 2
5.	Initialize UI elements
6.	Initialize ‘weatherData’ list
7.	Retrieve input values
8.	Validate input values
9.	Add weather data to list
10.	Show success or error message
11.	Clear input fields
12.	Create intent to start display activity
13.	Put ‘weatherData’ list as an extra intent
14.	Start display Activity (Linking to page 3)
15.	Define weather data class
16.	 On page 3, import statements
17.	Set content view 
18.	Initialize the TextViews
19.	Get weatherData from intent
20.	Check if weatherData is not Null
21.	Initialize variables
22.	Display
23.	Stop 
