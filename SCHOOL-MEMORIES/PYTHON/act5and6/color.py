rainbow = ['Red', 'Orange', 'Yellow', 'Green', 'Blue', 'Indigo', 'Violet']
print (f"The list below shows all the 7 colors in rainbow:\n{rainbow}")
print()
rainbow.insert(0,"Teal")
print (f"Added new color in the list:\n{rainbow}")
print()
colors = ['Pink', 'Brown']
rainbow.extend(colors)
print (f"Added new color in the list again:\n{rainbow}")
print()
rainbow.remove("Brown")
print (f"Remove one color in the list:\n{rainbow}")
print()
rainbow.remove("Indigo")
print (f"Remove another color in the list:\n{rainbow}")
print()
rainbows = ['Teal', 'Red', 'Orange', 'Pink', 'Yellow', 'Green', 'Blue', 'Violet', 'Pink']
print(f"Arrange the color names in the list alphabetically and its current length:\n{sorted(rainbows)} - {len(rainbows)}")
print()
duplicates = {color: rainbows.count(color) for color in set(rainbows) if rainbows.count(color) > 1}
print(f"Display the color name with duplicates and the number of times it appeared in the list:\n{list(duplicates.keys())} - {list(duplicates.values())[0]}")