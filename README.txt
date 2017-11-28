For this Case Study, the strategy adopted was to implement a minimum set of tests for the Front End exercise and for the API exercise, and increment them as time allowed.

FRONT END EXERCISES

For the Front End exercises, the following Test Cases were defined:

TC1 - Wikipedia Minimum Navigation Testing
Objective: Verify that the minimum navigation features of Wikipedia (load, search, search suggestion, result selection) are working as expected.
Step 1: Navigate to https://wikipedia.org.
E.R.: Page is loaded and title is 'Wikipedia".
Step 2: Insert 'furry rabbits" into the search field and click on Search button.
E.R.: 'Did you mean' suggestion link appears.
Step 3: Click on 'Did you mean' link.
E.R.: 20 search result links appear.
Step 4: Click on the first search result link displayed.
E.R.: The article should be loaded, contain a title and a table of contents.

TC2 - Travelex Window Resizing Testing
Objective: Verify that, when the Travelex page is resized to 550 px width or less, the items minimize and are accessible through a slider.
Step 1:
Navigate to https://travelex.co.uk.
E.R.: The page is loaded.
Step 2: Resize the window to 550px.
E.R.: The items are minimized and become a slider, the first item is displayed.
Step 3: Swipe left two times on the slider.
E.R.: verify that the third item is displayed.

To implement these TCs, the selected tool was Selenium Webdriver, because the bootstrap of a webpage automation using Webdriver takes only a couple of minutes. The steps required are creating a project - in this case, the project was created using Eclipse Oxygen IDE for Java Developers - and creating a test automation package containing the Selenium Webdriver libraries. The tests were implemented using Mozilla Firefox browser as the test platform, because it contains the native engine GeckoDriver that communicates with Webdriver, making the test setup quicker.

Initially, I intended to use JUnit engine for test execution and Pass/Fail logs with the Webdriver. Hovewer, I lost a couple of hours trying to make the Junit work with the Webdriver 3.x, without success. This progress can be seen at the project CaseStudy, in the repository. As I didn't have much time left, I started a second project, CaseStudy_part2, where I used only the Webdriver to implement the steps of the test case. As I wasn't using the JUnit engine, I only printed message logs for the passed or fail steps, not generating any Pass/Fail logs.

To execute the project, it should be imported into eclipse and run. Since Webdriver uses the Geckodriver for navigating the browser, it miht be necessary to update the Geckodriver location for successful execution.


