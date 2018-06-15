# -*- coding: utf-8 -*-
"""
Created on Wed Jun 13 09:06:01 2018

@author: Acer
"""
a=[1,2,3,4,5,6,7,8,9,10]
sum = 0
n = len(a) #ความยาวใน array
number = 1
for i in range (sum,n): #i คือตัวที่ อยู่ใน array ไล่ไปจนครบจำนวน n
    
    if number < len(a) : #จำนวนลูป น้อยกว่าจำนวนใน array
        sum = sum + a[i]
        number  += 1 #เพิ่มค่านับทีละ 1
    else :
        sum = sum + a[i] # บวกเพิ่มตัวสุดท้าย ก่อนแสดงผล
        print ("Sum of number in array loop " ,number, '=' ,sum)
        