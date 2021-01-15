// The "Jeopardy" class.
import java.awt.*;
import hsa.Console;

public class jeopardy
{
    static Console c;           // The output console
    static int total = 0;

    static int qcounter1 = -1;
    static int qprice1 = 0;

    static int qcounter2 = -1;
    static int qprice2 = 0;

    static int qcounter3 = -1;
    static int qprice3 = 0;

    static int qcounter4 = -1;
    static int qprice4 = 0;

    static int qcounter5 = -1;
    static int qprice5 = 0;

    static int qcounter6 = -1;
    static int qprice6 = 0;




    static int q2counter1 = -1;
    static int q2price1 = 0;

    static int q2counter2 = -1;
    static int q2price2 = 0;

    static int q2counter3 = -1;
    static int q2price3 = 0;

    static int q2counter4 = -1;
    static int q2price4 = 0;

    static int q2counter5 = -1;
    static int q2price5 = 0;

    static int q2counter6 = -1;
    static int q2price6 = 0;

    public static void main (String[] args)
    {
	c = new Console ();

	Font jeopardyfont = new Font ("Swis721 BdCnOul BT", Font.BOLD, 90);
	c.setFont (jeopardyfont);

	c.drawString ("Jeopardy!", 150, 150);

	String answer;
	int categorychoice;

	String[] categoryset1 = {"Animal", "Canada", "Phones", "Earth", "Movie", "Science"};

	String[] animalquestions = {"This bird has eyes that are larger than its brain", "This is the only mammal that can truly fly", "This mammal is carried in its mother's pouch", "This is the only bird known to fly backwards", "This is the name for the offspring of a male donkey and female horse"};
	String[] animalanswers = {"Ostrich", "Bat", "Kangaroo", "Hummingbird", "Hinny"};

	String[] canadaquestions = {"The second largest country in the world", "The highest tides occur here", "The capital of the country", "The most recent territory", "The most famous sport Canadians are known for"};
	String[] canadaanswers = {"Canada", "Bay of Fundy", "Ottawa", "Nunavut", "Hockey"};

	String[] phonesquestions = {"The year that the first iPhone was released", "Google's latest phone", "Samsung's latest phone", "The cost of the first mobile phone", "This gaming company released it's first phone in 2017"};
	String[] phonesanswers = {"2007", "Pixel 3", "Note 9", "4000", "Razer"};

	String[] earthquestions = {"The only planet known to have living organisms", "The natural phenomena that moves the Earth's crust", "The innermost core of the planet", "70% of the Earth is covered in this liquid", "The actual length of one Earth year"};
	String[] earthanswers = {"Earth", "Plate Tectonics", "Inner Core", "Water", "365.25"};

	String[] moviequestions = {"Film franchise focusing on a young boy with magical powers", "Film franchise focusing on a teenager who uses a bow and arrow to fight", "The latest Pixar movie", "Recent film starring artist Lady Gaga", "Disney's first princess"};
	String[] movieanswers = {"Harry Potter", "Hunger Games", "Incredibles 2", "A Star is Born", "Snow White"};

	String[] sciencequestions = {"Molecules composed of two atoms of the same element", "The organ system involving breathing", "This item is used to seperate light", "This type of cell has a nucleus enclosed within membranes", "The process in which a single cell divides into two identical cells"};
	String[] scienceanswers = {"Diatomic Molecules", "Respiratory System", "Prism", "Eukaryotic Cell", "Mitosis"};

	String[] categoryset2 = {"History", "Space", "Sports", "Ocean", "Music", "Moon"};

	String[] historyquestions = {"This man was the first Canadian Prime Minister", "The name originally used for \"O Canada\"", "The year Canada become a country", "The province that dinosaurs used to roam the most", "The year the current Canadian flag was proclaimed"};
	String[] historyanswers = {"John A. Macdonald", "Chant National", "1867", "Alberta", "1965"};

	String[] spacequestions = {"Extremely dense objects that suck up anything that goes near to them", "In 3.75 billion years, the Milky Way will collide with this galaxy", "The closest planet to the sun", "The only planet in our Solar System not named after a Greek or Roman God", "The Milky Way is this type of galaxy"};
	String[] spaceanswers = {"Black Holes", "Andromeda", "Mercury", "Earth", "Barred Spiral Galaxy"};

	String[] sportsquestions = {"The national sport of Canada", "The average golf ball has this many dimples", "Basketball was invented by this Canadian", "This country held the first modern Olympic games", "The name for the high-drag projectile used in badminton"};
	String[] sportsanswers = {"Lacrosse", "336", "James Naismith", "Greece", "Shuttlecock"};

	String[] oceanquestions = {"The percentage that is covered by the ocean", "The percentage of ocean that has been explored by humans", "The largest ocean on Earth", "Anything below this many feet is known as the \"Deep Sea\"", "This trench is the deepest recorded point on the ocean floor"};
	String[] oceananswers = {"70%", "5%", "Pacific Ocean", "300", "Mariana Trench"};

	String[] musicquestions = {"This instrument is believed to have been the first created", "This group of instruments produce sound when air is blown inside", "The guitar belongs to this category of instruments", "This instrument is regarded as one of the most difficult to learn", "The number of keys on a piano"};
	String[] musicanswers = {"Flute", "Woodwinds", "Strings", "Violin", "88"};

	String[] moonquestions = {"Another name for the moon", "This phenomenon seen on Earth is a result of the gravitational pull that the moon has", "The number of people who have walked on the moon", "An event similar to that of earthquakes, however they occur on the moon", "The fraction that something would weigh on the moon due to its weaker gravity"};
	String[] moonanswers = {"Luna", "Tides", "12", "Moonquakes", "1/6"};

	String[] round2categoryset1 = {"Verbs", "Bible", "7 Sins", "Celebs", "3 Times", "Medical"};

	String[] verbquestions = {"To put on the character & appearance of someone else", "3-letter animal verb meaning \"take more than your share of\"", "To express one's own opinions as if in a newspaper you ran", "Verb commonly used with \"a letter\", \"a lecture\", & \"a baby\"", "From the German for \"punish\", it's to fire on ground troops from a plane"};
	String[] verbanswers = {"Impersonate", "Hog", "Editorialize", "Deliver", "Strafe"};

	String[] biblequestions = {"After he was baptized, Jesus was tempted in the wilderness by Satan for this many days", "This \"beloved physician\" dedicated his gospel & the book of acts to a Christian named Theophilus", "John 13 says Jesus got up from supper, took a towel & began washing these parts of his disciples", "After Herod died, Joseph, Mary, & Jesus left Egypt & returned to this Galiliean city", "Among miracles in Capernaum was healing the servant of this Roman soldier who displayed deep faith in him"};
	String[] bibleanswers = {"40", "Luke", "Feet", "Nazareth", "The Centurion"};

	String[] sinsquestions = {"Too much self-esteem", "4-letter longing to possess something belonging to another", "Laziness, or a slow-moving animal", "Overconsumption of anything to the point of waste", "Intense longing for something, usually sexual"};
	String[] sinsanswers = {"Pride", "Envy", "Sloth", "Gluttony", "Lust"};

	String[] celebsquestions = {"Sharpay in High School Musical, or the voice actress for Candace on Phineas and Ferb", "She plays Black Widow in the MCU", "He plays Cedric Diggory in the Harry Potter films", "She played a famous archer in a recent young adult trilogy", "She recently received an Oscar for Best Actress for her role as an aspiring actress in a romantic musical"};
	String[] celebsanswers = {"Ashley Tisdale", "Scarlett Johansson", "Robert Pattinson", "Jennifer Lawrence", "Emma Stone"};

	String[] threequestions = {"Start a song by singing this way to get your boat \"gently down the stream\"", "Matthew McConaughey's special words", "Say the name of this ghost three times and he'll show up to exorcise the living", "Lord Harold Samuel gave this as the most important thing in real estate", "Say this noise that begins the lyrics of \"The Trolley Song\""};
	String[] threeanswers = {"Row, Row, Row", "All Right, All Right, All Right", "Beetlejuice, Beetlejuice, Beetlejuice", "Location, Location, Location", "Clang, Clang, Clang"};

	String[] medicalquestions = {"A score for normal vision using the Snellen test is this", "10-letter alternate name for sonography", "One of these compares blood types to help determine who's the father", "Change 3 letters in \"epidemic\" to get this term for an epidemic that has spread across the country", "Specialty that's most likely to deal with impetigo & psoriasis"};
	String[] medicalanswers = {"20/20", "Ultrasound", "Paternity Test", "Pandemic", "Dermatology"};

	String[] round2categoryset2 = {"Body", "Bugs","Words","Sushi","Online","Decade"};

	String[] bodyquestions = {"The body has over 600 of these, including extensors & flexors", "They can take 6 months to grow from base to tip, or from cuticle to what you chew", "The strongest bone in the human body", "Adults have this many teeth in their mouth", "A bone is joined to a muscle by this type of structure"};
	String[] bodyanswers = {"Muscles", "Fingernails", "Femur", "32", "Tendon"};

	String[] bugsquestions = {"1.   Lyme disease is transmitted to humans via the deer species of this bug", "2.     Each species of this bioluminescent bug has its own characteristic flashing pattern ", "3.       The brightly colored harlequin bug, also known by this \"smelly\" name, is a cabbage pest", "4.  Species of this insect include rhinoceros, Hercules & Goliath ", "5.     The 2 types of insects that make up the order Lepidoptera"};
	String[] bugsanswers = {"Tick", "Firefly", "Stinkbug", "Beetle", "Butterflies And Moths"}; //CONTINUE FINDING QUESTIONS

	String[] wordsquestions = {"1. This device that tests drivers to see if they're sober came into use around 1960", "2.   This word for a white wine & soda drink first appeared in Webster's in 1961", "3.        Kodak coined this word for its self-loading camera in the early '60s", "4.       A clause in a document making a condition or restriction; you may have heard of the Wilmot one", "5.     A harsh expression substituted for a more neutral one is a dysphemism & this is the opposite"};
	String[] wordsanswers = {"Breathalyzer", "Spritzer", "Instamatic", "Proviso", "Euphemism"};

	String[] sushiquestions = {"1. Used to wrap pieces of sushi, this substance is called nori", "2.        Named for a U.S. state, this item is also popular in Japan", "3. Sushi connoisseur Shigo Ito refreshes her palate with pickled strips of this root", "4.  The topping seen here is ikura, made of these from a salmon", "5.        As an appetizer, you may serve this fish dish that's been called \"sushi without the rice\""};
	String[] sushianswers = {"Seaweed", "California Roll", "Ginger", "Roe", "Sashimi"};

	String[] onlinequestions = {"Be careful who you talk to in these online \"rooms\" -- people may not be who they say they are", "Like a doomed plane, it describes system failure due to software or hardware malfunction", "3.   It doesn't mean \"to continue with wood\", it means to type in your I.D. & password in order to get started", "4.        Another way to say \"transferring\" something to your computer", "5.     The code that runs your computer is known as"};
	String[] onlineanswers = {"Chat Rooms", "Crash", "Log On", "Downloading", "Software"};

	String[] decadesquestions = {"Hurricane Andrew hits Florida", "\"I Love Lucy\" premieres", "Last time a man walked on the moon", "Next year's decade", "The introduction of the television"};
	String[] decadesanswers = {"1990s", "1950s", "1970s", "2020s", "1920s"};

	int finalroundamount;

	c.setCursor (20, 30);
	c.println ("Press any key to continue");
	c.getChar ();
	c.clear ();

	board ();

	int gamechooser = (int) (Math.random () * 2) + 1; 

	if (gamechooser == 1)
	    cat (categoryset1);

	else
	    cat (categoryset2);

	singlejeopardy ();
	c.setCursor (22, 1);

	for (int x = 0 ; x < 30 ; x++)
	{
	    categorychoice = categoryselectmethod ();

	    if (gamechooser == 1)
		arraytobringmethodcat1 (categorychoice, gamechooser, animalquestions, animalanswers, canadaquestions, canadaanswers, phonesquestions, phonesanswers, earthquestions, earthanswers, moviequestions, movieanswers, sciencequestions, scienceanswers); //ADD EVERYTHING TO BRING IN THIS ONE

	    else
		arraytobringmethodcat2 (categorychoice, gamechooser, historyquestions, historyanswers, spacequestions, spaceanswers, sportsquestions, sportsanswers, oceanquestions, oceananswers, musicquestions, musicanswers, moonquestions, moonanswers);

	}

	delay (5000);
	c.clear ();

	Font newroman = new Font ("Times New Roman", Font.BOLD, 25);
	c.setFont (newroman);
	c.setColor (Color.black);
	c.drawString ("Moving on to Round 2!", 200, 200);
	delay (5000);
	c.clear ();

	board ();

	int gamechooser2 = (int) (Math.random () * 2) + 1;
	gamechooser2 = 2; //get rid of this later

	if (gamechooser2 == 1)
	    cat (round2categoryset1);
	else
	    cat (round2categoryset2);

	doublejeopardy ();
	c.setCursor (22, 1);

	for (int x = 0 ; x < 30 ; x++)
	{
	    categorychoice = categoryselectmethod ();

	    if (gamechooser2 == 1)
		round2arraytobringtomethodcat1 (categorychoice, gamechooser2, verbquestions, verbanswers, biblequestions, bibleanswers, sinsquestions, sinsanswers, celebsquestions, celebsanswers, threequestions, threeanswers, medicalquestions, medicalanswers);

	    else
		round2arraytobringtomethodcat2 (categorychoice, gamechooser2, bodyquestions, bodyanswers, bugsquestions, bugsanswers, wordsquestions, wordsanswers, sushiquestions, sushianswers, onlinequestions, onlineanswers, decadesquestions, decadesanswers);

	}

	delay (5000);
	c.clear ();


	c.setFont (newroman);
	c.setColor (Color.black);
	c.drawString ("Moving on to Final Round!", 200, 200);
	delay (5000);
	c.clear ();

	c.println ("Enter the amount of money you are willing to risk losing");

	do
	{
	    finalroundamount = c.readInt ();

	    if (finalroundamount > total || finalroundamount < 0)
		c.println ("Please enter a positive amount less than or equal to your total... Your total is" + total);
	}
	while (finalroundamount > total || finalroundamount < 0); 
	

	c.setColor (Color.blue);
	c.fillRect (1, 1, 650, 424);

	//final round

	Font newromanbig = new Font ("Times New Roman", Font.BOLD, 30);
	c.setFont (newromanbig);

	int gamechooser3 = (int) (Math.random () * 3) + 1;
	c.setCursor (22, 1);

	if (gamechooser3 == 1)
	{
	    c.println ("This nation was the first to give women the right to vote");
	    answer = c.readLine ();

	    if (answer.equals ("New Zealand"))
	    {
		c.println ("Correct!");
		total += finalroundamount;
		delay (3000);

	    }

	    else
	    {
		c.println ("Incorrect! Correct answer is: New Zealand.");
		c.println ("Press any key to continue");
		c.getChar ();
		total -= finalroundamount;

	    }

	}

	else if (gamechooser3 == 2)
	{
	    c.println ("This ocean goes to the deepest depths");
	    answer = c.readLine ();

	    if (answer.equals ("Pacific Ocean"))
	    {
		c.println ("Correct!");
		total += finalroundamount;
		delay (3000);


	    }

	    else
	    {
		c.println ("Incorrect! Correct answer is: Pacific Ocean.");
		c.println ("Press any key to continue");
		c.getChar ();
		total -= finalroundamount;

	    }
	}

	else
	{
	    c.println ("This country has not fought a war since 1814");
	    answer = c.readString ();

	    if (answer.equals ("Sweden"))
	    {
		c.println ("Correct!");
		total += finalroundamount;
		delay (3000);

	    }

	    else
	    {
		c.println ("Incorrect! Correct answer is: Sweden.");
		c.println ("Press any key to continue");
		c.getChar ();
		total -= finalroundamount;

	    }
	}
	
	delay (5000);
	c.clear();
	endscreen (total);


	// Place your program here.  'c' is the output console
    } // main method


    public static void board ()
    {
	c.setColor (Color.blue);
	c.fillRect (1, 1, 650, 424);
	c.setColor (Color.black);

	for (int row = 0 ; row < 400 ; row += 70)
	{
	    for (int x = 0 ; x <= 650 ; x += 106)
	    {
		c.drawRect (x, row, 106, 74);
	    }
	}
    }


    public static void cat (String[] catset)
    {
	int x = 10;
	Font newroman = new Font ("Times New Roman", Font.BOLD, 25);
	c.setColor (Color.white);
	c.setFont (newroman);

	for (int count = 0 ; count < 6 ; count++)
	{
	    c.drawString ("" + catset [count], x, 40);
	    x += 107;
	}

    }


    public static void singlejeopardy ()
    {
	c.setColor (Color.yellow);


	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 200, x, 115);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 400, x, 185);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 600, x, 255);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 800, x, 325);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 1000, x, 395);

	}
    }




    public static void doublejeopardy ()
    {
	c.setColor (Color.yellow);


	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 400, x, 115);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 800, x, 185);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 1200, x, 255);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 1600, x, 325);

	}

	for (int x = 27 ; x < 649 ; x += 107)
	{

	    c.drawString ("" + 2000, x, 395);

	}
    }




    public static void clearbottom ()
    {
	c.setCursor (22, 1);
	c.println ();
	c.setCursor (23, 1);
	c.println ();
	c.setCursor (24, 1);
	c.println ();

	c.setCursor (22, 1);
    }


    public static void delay (int millisecs)  // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }


    public static void gamemethod (int categorychoice, int gamechooser, String[] arrayquestions, String[] arrayanswers)
    {
	String answer;

	if (gamechooser == 1)
	{
	    if (categorychoice == 1)
	    {
		qcounter1++;
		qprice1++;

		clearbottom ();

		if (qprice1 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter1]);
		    c.print ("What is an ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice1 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (qprice1 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice1 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice1 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}


	    }

	    else if (categorychoice == 2) //CATEGORY 2 BEGINS
	    {
		qcounter2++;
		qprice2++;
		clearbottom ();

		if (qprice2 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice2 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter2]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (qprice2 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice2 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter2]);
		    c.print ("What are the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice2 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 3) //Category 3 begins here
	    {

		qcounter3++;
		qprice3++;
		clearbottom ();

		if (qprice3 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (qprice3 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter3]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (qprice3 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter3]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice3 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter3]);
		    c.print ("What is $");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice3 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 4) //CATEGORY 4
	    {
		qcounter4++;
		qprice4++;
		clearbottom ();

		if (qprice4 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (qprice4 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (qprice4 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter4]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice4 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice4 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }
		}
	    }

	    else if (categorychoice == 5) //category 5
	    {

		qcounter5++;
		qprice5++;
		clearbottom ();

		if (qprice5 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter5]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (qprice5 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter5]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice5 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter5]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice5 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter5]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice5 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter5]);
		    c.print ("Who is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else //category 6
	    {

		qcounter6++;
		qprice6++;
		clearbottom ();

		if (qprice6 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter6]);
		    c.print ("What are ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (qprice6 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter6]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (qprice6 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter6]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice6 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter6]);
		    c.print ("What is a ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice6 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter6]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }
		}
	    }
	}

	else //ADJUST TO MATCH TOP
	{
	    if (categorychoice == 1)
	    {
		clearbottom ();
		qprice1++;
		qcounter1++;

		if (qprice1 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter1]);
		    c.print ("Who is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (qprice1 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter1]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice1 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter1]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice1 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter1]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice1 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter1]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter1]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 2)
	    {
		clearbottom ();
		qprice2++;
		qcounter2++;

		if (qprice2 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter2]);
		    c.print ("What are ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (qprice2 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter2]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice2 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter2]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice2 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice2 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter2]);
		    c.print ("What is a ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter2]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 3)
	    {
		clearbottom ();
		qprice3++;
		qcounter3++;

		if (qprice3 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (qprice3 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice3 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter3]);
		    c.print ("Who is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice3 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice3 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter3]);
		    c.print ("What is a ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter3]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 4)
	    {
		clearbottom ();
		qprice4++;
		qcounter4++;

		if (qprice4 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (qprice4 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice4 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter4]);
		    c.print ("Who is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice4 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice4 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter4]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter4]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 5)
	    {

		clearbottom ();
		qprice5++;
		qcounter5++;

		if (qprice5 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter5]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (qprice5 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter5]);
		    c.print ("What are ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice5 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter5]);
		    c.print ("What are ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice5 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter5]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice5 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter5]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter5]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else
	    {
		clearbottom ();
		qprice6++;
		qcounter6++;

		if (qprice6 == 1)
		{
		    c.println ("Question 1 for $200: " + arrayquestions [qcounter6]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("200", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 200 < 0)
			    total = 0;
			else
			    total -= 200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("200", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (qprice6 == 2)
		{
		    c.println ("Question 2 for $400: " + arrayquestions [qcounter6]);
		    c.print ("What are the ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice6 == 3)
		{
		    c.println ("Question 3 for $600: " + arrayquestions [qcounter6]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("600", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 600 < 0)
			    total = 0;
			else
			    total -= 600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("600", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice6 == 4)
		{
		    c.println ("Question 4 for $800: " + arrayquestions [qcounter6]);
		    c.print ("What are ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (qprice6 == 5)
		{
		    c.println ("Question 5 for $1000: " + arrayquestions [qcounter6]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [qcounter6]))
		    {
			total += 1000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1000 < 0)
			    total = 0;
			else
			    total -= 1000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }
	}
    }


    public static void gamemethod2 (int categorychoice, int gamechooser2, String[] arrayquestions, String[] arrayanswers)
    {
	String answer;

	if (gamechooser2 == 1)
	{
	    if (categorychoice == 1)
	    {
		q2counter1++;
		q2price1++;

		clearbottom ();

		if (q2price1 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter1]);
		    c.print ("What is an ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price1 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (q2price1 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price1 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price1 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter1]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}


	    }

	    else if (categorychoice == 2) //CATEGORY 2 BEGINS
	    {
		q2counter2++;
		q2price2++;
		clearbottom ();

		if (q2price2 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price2 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter2]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (q2price2 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price2 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter2]);
		    c.print ("What are the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price2 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 3) //Category 3 begins here
	    {

		q2counter3++;
		q2price3++;
		clearbottom ();

		if (q2price3 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (q2price3 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter3]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (q2price3 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter3]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price3 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter3]);
		    c.print ("What is $");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price3 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 4) //CATEGORY 4
	    {
		q2counter4++;
		q2price4++;
		clearbottom ();

		if (q2price4 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (q2price4 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (q2price4 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter4]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price4 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price4 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }
		}
	    }

	    else if (categorychoice == 5) //category 5
	    {

		q2counter5++;
		q2price5++;
		clearbottom ();

		if (q2price5 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter5]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (q2price5 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter5]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price5 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter5]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price5 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter5]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price5 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter5]);
		    c.print ("Who is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else //category 6
	    {

		q2counter6++;
		q2price6++;
		clearbottom ();

		if (q2price6 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter6]);
		    c.print ("What are ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }



		}

		else if (q2price6 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter6]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }


		}

		else if (q2price6 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter6]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price6 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter6]);
		    c.print ("What is a ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price6 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter6]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }
		}
	    }
	}

	else
	{
	    if (categorychoice == 1)
	    {
		clearbottom ();
		q2price1++;
		q2counter1++;

		if (q2price1 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter1]);
		    c.print ("Who is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 27, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (q2price1 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter1]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 27, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price1 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter1]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 27, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price1 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter1]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 27, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price1 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter1]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter1]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 27, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 2)
	    {
		clearbottom ();
		q2price2++;
		q2counter2++;

		if (q2price2 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter2]);
		    c.print ("What are ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 134, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (q2price2 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter2]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 134, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price2 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter2]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 134, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price2 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter2]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 134, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price2 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter2]);
		    c.print ("What is a ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter2]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 134, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 3)
	    {
		clearbottom ();
		q2price3++;
		q2counter3++;

		if (q2price3 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 241, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (q2price3 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 241, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price3 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter3]);
		    c.print ("Who is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 241, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price3 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter3]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 241, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price3 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter3]);
		    c.print ("What is a ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter3]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 241, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 4)
	    {
		clearbottom ();
		q2price4++;
		q2counter4++;

		if (q2price4 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 348, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (q2price4 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 348, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price4 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter4]);
		    c.print ("Who is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 348, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price4 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter4]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 348, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price4 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter4]);
		    c.print ("What is the ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter4]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 348, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else if (categorychoice == 5)
	    {

		clearbottom ();
		q2price5++;
		q2counter5++;

		if (q2price5 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter5]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 455, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (q2price5 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter5]);
		    c.print ("What are ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 455, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price5 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter5]);
		    c.print ("What are ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 455, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price5 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter5]);
		    c.print ("What is a ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 455, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price5 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter5]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter5]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 455, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }

	    else
	    {
		clearbottom ();
		q2price6++;
		q2counter6++;

		if (q2price6 == 1)
		{
		    c.println ("Question 1 for $400: " + arrayquestions [q2counter6]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 400;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("400", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 400 < 0)
			    total = 0;
			else
			    total -= 400;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("400", 562, 115);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }

		}

		else if (q2price6 == 2)
		{
		    c.println ("Question 2 for $800: " + arrayquestions [q2counter6]);
		    c.print ("What are the ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 800;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("800", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 800 < 0)
			    total = 0;
			else
			    total -= 800;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("800", 562, 185);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price6 == 3)
		{
		    c.println ("Question 3 for $1200: " + arrayquestions [q2counter6]);
		    c.print ("What is ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 1200;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1200", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1200 < 0)
			    total = 0;
			else
			    total -= 1200;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1200", 562, 255);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price6 == 4)
		{
		    c.println ("Question 4 for $1600: " + arrayquestions [q2counter6]);
		    c.print ("What are ");
		    answer = c.readString ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 1600;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("1600", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 1600 < 0)
			    total = 0;
			else
			    total -= 1600;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("1600", 562, 325);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}

		else if (q2price6 == 5)
		{
		    c.println ("Question 5 for $2000: " + arrayquestions [q2counter6]);
		    c.print ("What is ");
		    answer = c.readLine ();

		    if (answer.equals (arrayanswers [q2counter6]))
		    {
			total += 2000;
			clearbottom ();
			c.setCursor (22, 1);
			c.println ("Correct!");
			c.setCursor (23, 1);
			c.println ("Total is now $" + total);
			c.setColor (Color.green);
			c.drawString ("2000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();
		    }

		    else
		    {
			if (total - 2000 < 0)
			    total = 0;
			else
			    total -= 2000;

			clearbottom ();
			c.println ("Incorrect!");
			c.println ("Total is now $" + total);
			c.setColor (Color.red);
			c.drawString ("2000", 562, 395);
			c.setColor (Color.black);
			c.setCursor (24, 1);
			c.print ("Press any key to continue");
			c.getChar ();
			clearbottom ();

		    }
		}
	    }
	}
    }



    public static int categoryselectmethod ()
    {
	int categorychoice;
	do
	{
	    c.println ("Which category (1-6)?");
	    categorychoice = c.readInt ();

	    if (categorychoice < 1 || categorychoice > 6)
	    {
		clearbottom ();
	    }
	}


	while (categorychoice < 1 || categorychoice > 6); //FIGURE OUT WAY TO MAKE SURE IF CATEGORY IS FULL NOT TO LET THEM ENTER IT

	return categorychoice;
    }


    public static void arraytobringmethodcat1 (int categorychoice, int gamechooser, String[] animalquestions, String[] animalanswers, String[] canadaquestions, String[] canadaanswers, String[] phonesquestions, String[] phonesanswers, String[] earthquestions, String[] earthanswers, String[] moviequestions, String[] movieanswers, String[] sciencequestions, String[] scienceanswers)

    {
	if (categorychoice == 1)
	{
	    gamemethod (categorychoice, gamechooser, animalquestions, animalanswers);
	}


	else if (categorychoice == 2)
	{
	    gamemethod (categorychoice, gamechooser, canadaquestions, canadaanswers);
	}


	else if (categorychoice == 3)
	{
	    gamemethod (categorychoice, gamechooser, phonesquestions, phonesanswers);
	}


	else if (categorychoice == 4)
	{
	    gamemethod (categorychoice, gamechooser, earthquestions, earthanswers);
	}


	else if (categorychoice == 5)
	{
	    gamemethod (categorychoice, gamechooser, moviequestions, movieanswers);
	}


	else if (categorychoice == 6)
	{
	    gamemethod (categorychoice, gamechooser, sciencequestions, scienceanswers);
	}
    }


    public static void arraytobringmethodcat2 (int categorychoice, int gamechooser, String[] physicsquestions, String[] physicsanswers, String[] spacequestions, String[] spaceanswers, String[] sportsquestions, String[] sportsanswers, String[] oceanquestions, String[] oceananswers, String[] musicquestions, String[] musicanswers, String[] moonquestions, String[] moonanswers)
    {
	if (categorychoice == 1)
	{
	    gamemethod (categorychoice, gamechooser, physicsquestions, physicsanswers);
	}


	else if (categorychoice == 2)
	{
	    gamemethod (categorychoice, gamechooser, spacequestions, spaceanswers);
	}


	else if (categorychoice == 3)
	{
	    gamemethod (categorychoice, gamechooser, sportsquestions, sportsanswers);
	}


	else if (categorychoice == 4)
	{
	    gamemethod (categorychoice, gamechooser, oceanquestions, oceananswers);
	}


	else if (categorychoice == 5)
	{
	    gamemethod (categorychoice, gamechooser, musicquestions, musicanswers);
	}


	else if (categorychoice == 6)
	{
	    gamemethod (categorychoice, gamechooser, moonquestions, moonanswers);
	}
    }


    public static void round2arraytobringtomethodcat1 (int categorychoice, int gamechooser2, String[] verbquestions, String[] verbanswers, String[] biblequestions, String[] bibleanswers, String[] sinsquestions, String[] sinsanswers, String[] celebsquestions, String[] celebsanswers, String[] threequestions, String[] threeanswers, String[] medicalquestions, String[] medicalanswers)
    {
	if (categorychoice == 1)
	{
	    gamemethod2 (categorychoice, gamechooser2, verbquestions, verbanswers);
	}


	else if (categorychoice == 2)
	{
	    gamemethod2 (categorychoice, gamechooser2, biblequestions, bibleanswers);
	}


	else if (categorychoice == 3)
	{
	    gamemethod2 (categorychoice, gamechooser2, sinsquestions, sinsanswers);
	}


	else if (categorychoice == 4)
	{
	    gamemethod2 (categorychoice, gamechooser2, celebsquestions, celebsanswers);
	}


	else if (categorychoice == 5)
	{
	    gamemethod2 (categorychoice, gamechooser2, threequestions, threeanswers);
	}


	else if (categorychoice == 6)
	{
	    gamemethod2 (categorychoice, gamechooser2, medicalquestions, medicalanswers);
	}
    }


    public static void round2arraytobringtomethodcat2 (int categorychoice, int gamechooser2, String[] bodyquestions, String[] bodyanswers, String[] bugsquestions, String[] bugsanswers, String[] wordsquestions, String[] wordsanswers, String[] sushiquestions, String[] sushianswers, String[] onlinequestions, String[] onlineanswers, String[] decadesquestions, String[] decadesanswers)
    {
	if (categorychoice == 1)
	{
	    gamemethod2 (categorychoice, gamechooser2, bodyquestions, bodyanswers);
	}


	else if (categorychoice == 2)
	{
	    gamemethod2 (categorychoice, gamechooser2, bugsquestions, bugsanswers);
	}


	else if (categorychoice == 3)
	{
	    gamemethod2 (categorychoice, gamechooser2, wordsquestions, wordsanswers);
	}


	else if (categorychoice == 4)
	{
	    gamemethod2 (categorychoice, gamechooser2, sushiquestions, sushianswers);
	}


	else if (categorychoice == 5)
	{
	    gamemethod2 (categorychoice, gamechooser2, onlinequestions, onlineanswers);
	}


	else if (categorychoice == 6)
	{
	    gamemethod2 (categorychoice, gamechooser2, decadesquestions, decadesanswers);
	}
    }


    public static void endscreen (int total)
    {
	Font newroman = new Font ("Times New Roman", Font.BOLD, 25);
	c.setFont (newroman);
	c.setColor (Color.black);
	c.drawString ("Congratualations! You won $" +total+ " today!", 150, 200);
    }
} 
 // Jeopardy class
