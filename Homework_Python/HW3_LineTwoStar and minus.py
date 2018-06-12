# -*- coding: utf-8 -*-
"""
Created on Tue Jun 12 09:45:56 2018

@author: Acer
"""

a=int(input("Enter your number * you want..."))
for i in range (1,a+1) :
 if i % 3==0:
     print('-',end="")
 else :
     print('*',end="")