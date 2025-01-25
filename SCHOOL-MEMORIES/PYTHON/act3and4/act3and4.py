"""Name with Fixed String"""
Name = "FULL NAME IS: RONDINELLI HERRERA"

"""User Input Age, Gender, Birthplace and BirthYear"""
Age = int(input("ENTER AGE: "))
Gender = input("ENTER GENDER| [M]ale, [F]emale: ")
Birthplace = input("ENTER BIRTHPLACE: ")
BirthYear = int(input("YOUR BIRTH YEAR IS: "))

"""Functions for Mr/Ms & Child, Teenager, Adult, and Senior Citizen"""

if Gender == "M":
    Titles: str = "MR."
else:
    Titles: str = "MS."

if 0 < Age <= 10:
    Group: str = "CHILD"
elif 11 <= Age <= 25:
    Group: str = "TEENAGER"
elif 26 <= Age <= 59:
    Group: str = "ADULT"
elif Age >= 60:
    Group: str = "SENIOR CITIZEN"
else:
    Group = "Invalid Age"

"""Final Output"""
print("")
print(Titles + " L. HERRERA,")
print("YOUR BIRTH YEAR IS: " + str(BirthYear))
print("YOU ARE A/AN " + Group + " WHO WAS BORN IN " + Birthplace)
