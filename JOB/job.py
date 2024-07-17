import pyautogui
import time
from PIL import Image
import pytesseract
from datetime import datetime
import random
import re
today_date = datetime.today().date()




def write_email_list_to_file(email_list, filename):
    with open(filename, 'w') as file:
        for email in email_list:
            file.write(email + '\n')

def read_email_list_from_file(filename):
    with open(filename, 'r') as file:
        email_list = [line.strip() for line in file]
    return email_list

def send_email_with_pyautogui(mail):
    # Open your web browser and navigate to Gmail

    time.sleep(3)
    location = pyautogui.locateOnScreen("compose.png")

    # Click on Compose button
    pyautogui.click(location[0]+10,location[1]+10)
    time.sleep(2)

    # Fill in recipient email address
    
    pyautogui.write(mail)
    time.sleep(2)
    pyautogui.press('tab')
    time.sleep(2)
    pyautogui.press('tab')
    # Fill in subject
    pyautogui.write('Application for Python Developer')
    pyautogui.press('tab')
    time.sleep(2)
    # Fill in message body
    message_body = '''Dear Recruiter,

I hope this email finds you well. I am writing to express my interest in the Python Developer position advertised on LinkedIn. Attached is my resume for your review.

Thank you for considering my application. I am eager to discuss how my skills align with the needs of the position.

Best regards,
Purnima Agarwal'''
    pyautogui.write(message_body)
    pyautogui.press('tab')
    time.sleep(2)
    pyautogui.press('tab')
    time.sleep(2)
    pyautogui.press('tab')
    pyautogui.press('enter')
    time.sleep(5)
      # Path to your resume file
    location = pyautogui.locateOnScreen("resume.png")

    
    pyautogui.click(x=location[0]+5,y=location[1]+2,clicks=2, interval=0.1)
    time.sleep(3)
    pyautogui.press('tab')
    pyautogui.press('enter')

    # Wait for the email to be sent
    time.sleep(5)

  
def dosome():

            
    time.sleep(2)
    screenshot = pyautogui.screenshot()
    #temp_image_path = str(today_date)+ str(i)+".png"
    #screenshot.save(temp_image_path)
    text = pytesseract.image_to_string(screenshot)
    
    email_pattern = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
    emails = re.findall(email_pattern, text)
    time.sleep(2)
    pyautogui.scroll(-500)
    return emails

time.sleep(2)
image_path = 'see.png'
pyautogui.FAILSAFE = False
emails=[]
i=0
old_Email = read_email_list_from_file('email.txt')


while len(emails) < 25:
    try:
        location = pyautogui.locateOnScreen(image_path)
        if location:
            time.sleep(3)
            pyautogui.click(x=location[0]+10, y=location[1])
            ema =  dosome()
            for e in ema:
                if e not in emails and e not in old_Email:
                    emails.append(e)
            
        pyautogui.moveTo(x=0,y=0)
        i=i+1
        

    except:
        ema =  dosome()
        for e in ema:
            if e not in emails and e not in old_Email:
                emails.append(e)
        pyautogui.moveTo(x=10, y=500)
print(emails)

#("Python DEveloper" AND "2  Year") AND "Hiring"



time.sleep(5)
pyautogui.hotkey('ctrl', 'tab')
time.sleep(5)
# Call the function to send email
for mail in emails:
    time.sleep(random.randint(93,135))
    send_email_with_pyautogui(mail)
   

write_email_list_to_file(emails+old_Email, 'email.txt')