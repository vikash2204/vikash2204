### PROBLEM STATEMENT 👋

- 🔭 Our custom-build server logs different events to a file named logfile.txt. Every event has 2 entries in the file - one entry when the event was started and another when the event was finished. The entries in the file have no specific order (a finish event could occur before a start event for a given id) Every line in the file is a JSON object. The program should:

- Take the path to logfile.txt as an input argument
- Parse the contents of logfile.txt
- Flag any long events that take longer than 4ms
- Write the found event details to file-based HSQLDB (http://hsqldb.org/) in the working folder
- The application should create a new table if necessary and store the following values:
Event id

Event duration

Type and Host if applicable

Alert

