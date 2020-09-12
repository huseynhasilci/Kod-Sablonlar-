import numpy

a = numpy.array([1,2,3,4], float)
b = numpy.array([5,6,7,8], float)

#print(a+b)
#print(a-b)
#print(a*b)
#print(a//b)
#print(a%b)
#print(numpy.power(a, b,where = "optional"))


# bir listeyi soldan saga dogru hareket ettirme
def rotLeft(a, d):
    a = a[d:] + a[:d]
    #  a = a[-d:] + a[:-d] bu da sagdan 
liste = [1,2,3,4,5,6,7]

for i in range(len(liste)):
    print(liste[i],end = " ")# yan yana yazdirir
    
def swap_case(s):
    return s.swapcase() #bunun sayesinde kucuk olan butun strler buyuk buyuk olanlar kucuk olur



def mutate_string(string, position, character):
    l = list(string)
    l[position] = character
    string = ''.join(l)
    string = string[:position] + character + string[position+1:]
    return string # bir string'in degerleri degistirilemeyecegi icin ilk once liste haline getiririz daha sonra eklemek istedigimiz karakteri join ile ekleriz 
print(bin(17))


import decimal
def print_formatted(number):
    for i in range(1,number+1):
        print(str(decimal.Decimal(i))+ "  "+str(oct(i)[2:])+"  "+str(hex(i)[2:]).capitalize() +"  "+str(bin(i)[2:]))
print_formatted(100)


def average(array):
    my_dict = {}
    for i in array:
        if i not in my_dict:
            my_dict[i] = 1
        else:
            my_dict[i] += 1
    counter = 0
    for i in my_dict.keys():
        counter += i
    
    sum_array = counter/len(my_dict)    
    return sum_array
print(average([161, 182, 161, 154, 176, 170, 167, 171, 170, 174]))













































