def maxSubArraySum(a,size):
    ##Your code here
    maxEndingHere = a[0]
    maxSoFar = a[0]
    for num in a[1:]:
        maxEndingHere = max(num, maxEndingHere + num)
        maxSoFar = max(maxSoFar, maxEndingHere)
    return maxSoFar
