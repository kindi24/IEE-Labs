/*
  LiquidCrystal Library - Hello World

 Demonstrates the use a 16x2 LCD display.  The LiquidCrystal
 library works with all LCD displays that are compatible with the
 Hitachi HD44780 driver. There are many of them out there, and you
 can usually tell them by the 16-pin interface.

 This sketch prints "Hello World!" to the LCD
 and shows the time.

  The circuit:
 * LCD RS pin to digital pin 12
 * LCD Enable pin to digital pin 11
 * LCD D4 pin to digital pin 5
 * LCD D5 pin to digital pin 4
 * LCD D6 pin to digital pin 3
 * LCD D7 pin to digital pin 2
 * LCD R/W pin to ground
 * LCD VSS pin to ground
 * LCD VCC pin to 5V
 * 10K resistor:
 * ends to +5V and ground
 * wiper to LCD VO pin (pin 3)

 Library originally added 18 Apr 2008
 by David A. Mellis
 library modified 5 Jul 2009
 by Limor Fried (http://www.ladyada.net)
 example added 9 Jul 2009
 by Tom Igoe
 modified 22 Nov 2010
 by Tom Igoe

 This example code is in the public domain.

 http://www.arduino.cc/en/Tutorial/LiquidCrystal
 */

// include the library code:
#include <LiquidCrystal.h>

// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
int x;
int y;
int i;
char temp;

#define	BUF_SIZE	17  
volatile char curMessage[BUF_SIZE] = {"DIPAE-STATHMOS  "};


void setup() {
  // set up the LCD's number of columns and rows:
  lcd.begin(16, 1);
  
  for (i = 0; i < 16; i++){
  	lcd.setCursor(i,0);
    lcd.print(curMessage[i]);
  }
  
}

void loop() 
{ 
  for (x = 14; x > -1; x--){
  	 y = x + 1;
     temp = curMessage[x];
     curMessage[x] = curMessage[y];
     curMessage[y] = temp;
  }
  for (i = 0; i < 16; i++){
  	lcd.setCursor(i,0);
    lcd.print(curMessage[i]);
  }
  delay(100);
}
