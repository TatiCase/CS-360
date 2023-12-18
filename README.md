Briefly summarize the requirements and goals of the app you developed. What user needs was this app designed to address?
The requirements of this app were to build a functional app that used a database to store daily weights, a target weight, and a username/password for logging in. The app should allow a user to login or sign up using a single button that added them to the user/password database if they were not already there. The daily weights should be able to be deleted by the user. The taret weight should only be able to be initially set and then edited. The user needs this was designed to address are tracking daily weight and assessing it against a target. The app should also have a notification when the user reaches the target. This portion does not work in my app due to time constraints, but everything else does.


What screens and features were necessary to support user needs and produce a user-centered UI for the app? How did your UI designs keep users in mind? Why were your designs successful?
The screens needed were: login, home, history, add record, set/edit goal, and permissions. This gave each screen a primary function that made the app easy to use. My designs kept the users in mind by giving them something simple and friendly to interact with. There is no ambiguity as to what the screens are for and how to interact with them. My designs were successful because they executed their tasks (except the settings one where the notification is not yet coded). The designs make it clear and easy to interact with, which is pleasing for users.


How did you approach the process of coding your app? What techniques or strategies did you use? How could those be applied in the future?
Coding my app was a challenge. I started with the UI. Then I moved on to the database and the Java. I first attempted to employ fragments and instances. This worked to an extent, but was very cumbersome to incorporate database functions that affected individual fragments. The second option I chose was to employ activities. This worked out much better as each activity had its own Java class where I could manipulate the display and data. I would apply this in the future because it made my job as the programmer much more straightforward. I did eventually figure out the fragment dynamic population, but then I could not delete from the database with it because the ID's never matched.


How did you test to ensure your code was functional? Why is this process important and what did it reveal?
I tested primarly by running the app in the emulators. I should have done some JUnit tests, but like many school projects, time gets away from you. I also made extensive use of Toasts to highlight when acitons were completed successfully. This process reveals where your code is breaking down and it is important because you want to see how it will act in the hands of a user on a real phone. I still have room for improvement, for sure, but as first apps go, I think it came out really well.

Considering the full app design and development process, from initial planning to finalization, where did you have to innovate to overcome a challenge?
The database functions were where I had to innovate. I needed something that could dynamically populate a list of weights based on when they were entered. I initially did this by having a fragment and then calling an instance of it for each weight. This took quite some time, and eventually worked, but then I needed to be able to check which items to delete from that list and I could not figure out how to call the ID of a specific instance of a fragment and then use that in a database function. I ended up just making empty data targets and then dynamically populating them so that I could isolate my targets when I needed to.

In what specific component from your mobile app were you particularly successful in demonstrating your knowledge, skills, and experience?
I believe the UI was where I most successfully demonstrated my skills. I think the back end needs improvement, espeically the loops, but the UI, in my opinion, is pretty clean and minimalist. I also think the login worked out really well in my case. I took it on myself to implement encryption and only store encrypted passwords for user security and I think that showcased my ability to adapt code and learn quickly.


