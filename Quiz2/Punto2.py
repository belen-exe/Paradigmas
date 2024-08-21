palabras = ["perro", "gato", "elefante", "oso", "jirafa"]
palabrasLargas=list(filter(lambda palabras: len(palabras)>5, palabras))
print(palabrasLargas)