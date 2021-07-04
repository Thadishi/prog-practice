import numpy as np

#create a matrix
#Matrix for equation
A = np.array([[1,1], [2,-1]])

#matrix for answers
B = np.array([3.0,(1.5)])

##linear algorithm plots the lines on the cartesian plane

D = np.linalg.inv(A)
#this finds the intersections
E = np.dot(D,B)

##the asnwer
print(E)

