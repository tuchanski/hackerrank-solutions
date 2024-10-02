#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    
    min_sum = 0
    max_sum = 0
    bubble_sort(arr)
    
    for i in range(0, len(arr) - 1):
        min_sum += arr[i]
    
    for j in range(1, len(arr)):
        max_sum += arr[j]
    
    print(min_sum, max_sum)
    
# Not too performatic, but since max length is 5, no problem
def bubble_sort(arr):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            temp = arr[i]
            if arr[i] > arr[j]:
                arr[i] = arr[j]
                arr[j] = temp
    return arr

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))
    miniMaxSum(arr)
