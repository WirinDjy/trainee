# -*- coding: utf-8 -*-
"""
Created on Wed Jun 13 09:47:54 2018

@author: Acer
"""

a = [1,2,3,4,5,6,7,8,9,10]
sum = 0 
number =1 
for i in range (0,len(a)):
     if number <len(a): 
         sum = sum + a[i]
         number += 1
     else:
         sum = sum +a[i]
         avg = sum/len(a)
         print ("Avg if number in array is...",avg) #คอมม๊าาาา