def areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight):

    if yourLeft == friendsLeft:
        if yourRight == friendsRight:
            return True
        else:
            return False
    elif yourLeft == friendsRight:
        if yourRight == friendsLeft:
            return True
        else:
            return False
    else: 
        return Fals
