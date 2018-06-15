# -*- coding: utf-8 -*-
"""
Created on Wed Jun 13 14:14:49 2018

@author: Acer
"""

list=[1,2,3,4,5,6,7,8,9,10]
max = 0
for i in range (0,len(list)):
    valuelist = list[i]
    if valuelist > max :
        max = valuelist
    else :
        max = max
print("Max of number in Array is...",max)
        