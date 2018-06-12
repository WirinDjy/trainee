# -*- coding: utf-8 -*-
"""
Created on Tue Jun 12 10:49:42 2018

@author: Acer
"""

def _sum(arr,n):
    return (sum(arr))
arr=[1,2,3,4,5,6,7,8,9,10]
n=len(arr) #len คือ หาจำนวนอักขระในตัวอักษร arr
ans =_sum(arr,n)/n # หารออกกด้วยจำนวนใน array
print ("Avg of the array is" ,ans)