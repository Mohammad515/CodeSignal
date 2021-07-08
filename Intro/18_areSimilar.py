def areSimilar(A, B):
    if A==B:
        return True
    i = 0
    while i<len(A):
        if A[i]==B[i]:
            A.pop(i)
            B.pop(i)
        else:
            i += 1
    if len(A)!=2:
        return False
    B.reverse()
    if A==B:
        return True
    else:
        return Fals
