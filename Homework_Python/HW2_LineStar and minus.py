# -*- coding: utf-8 -*-
"""
Created on Tue Jun 12 09:44:53 2018

@author: Acer
"""

a=int(input("Enter your number * you want..."))
for i in range (1,a+1) :
 if i % 2==1:
     print('*',end="")
 else :
     print('-',end="")