# Example-for-Handling-Frames-with-Web-Element-Method
Assignment 2 W10D3 - SDA - Software QA Bootcamp


# Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)
* [References](#references)

---
# Question
Create Automation scripts using Selenium for Handling Frames with Web Element Method.

---

# Answer
## Set up
Before running the code, there are some steps that need to take considered:

### First:
Setup:
- [JDK](https://www.oracle.com/java/technologies/downloads/) (Lastest)
- [Eclipse](https://www.eclipse.org/) (Lastest)

Donwload the necessary jar files:
- [Selenium](https://www.selenium.dev/downloads/) (Lastest).
- [TestNG](http://www.java2s.com/Code/Jar/t/Downloadtestng685jar.htm) (Lastest).
- [webdrivermanager](https://jar-download.com/artifact-search/webdrivermanager) (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

## Code
I opened the website, then take web elements, and then add them to the code.

- Total number of iFrames on a web page By `JavascriptExecutor`
```md
JavascriptExecutor exe = (JavascriptExecutor) driver;
Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
System.out.println("Number of iframes on the page are " + numberOfFrames);
```

- Total number of iFrames on a web page By finding all the web elements using `iframe tag`
```md
List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
System.out.println("The total number of iframes are " + iframeElements.size());
```

- Switch to Frame using Index
```md
driver.switchTo().frame(0);
```

- Switch back to the main window
```md
driver.switchTo().defaultContent();
```

---

# Output Screenshots

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/185727937-211f8b34-2a05-4e70-8131-0738548966e5.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/185727985-12bd50d1-0375-4b56-9f9b-12a141a7456e.mp4


</p>

---
# References
- [Handling Iframes using Selenium WebDriver](https://www.toolsqa.com/selenium-webdriver/handling-iframes-using-selenium-webdriver/) 
- [iFrames in Selenium WebDriver](https://www.toolsqa.com/selenium-webdriver/handle-iframes-in-selenium/)
