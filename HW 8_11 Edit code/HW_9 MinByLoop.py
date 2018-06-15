# -*- coding: utf-8 -*-
"""
Created on Wed Jun 13 11:47:49 2018

@author: Acer
"""
list=[1,2,3,4,5,6,7,8,9,10]
min = 100
for i in range (0,len(list)):
    valueList = list[i]
    if valueList < min:
        min  = valueList 
    else :
        min  = min
print("Min of number in Array is...",min)
        