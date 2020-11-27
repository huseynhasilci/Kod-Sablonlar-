

hex_dict = {"0": "0000", "1" :"0001", "2": "0010", "3": "0011", "4": "0100", "5": "0101", "6": "0110", "7": "0111",
               "8":"1000","9":"1001","A":"1010","B":"1011","C":"1100","D":"1101","E":"1110","F":"1111"}

def unsigned_value(given_number):
    binary_rep = ""
    hex_rep = ""
    unsigned_list = []
    decimalValue= 0
    for i in given_number:
        if (i not in hex_dict.keys()):
            print("Wrong hexadecimal value please enter a valid hexadecimal value...")
            exit()
        else:
            continue
    if len(given_number) % 2 == 0:
        for i in given_number:
            unsigned_list.append(i)
    else:
        unsigned_list.append(0)
        for i in given_number:
            unsigned_list.append(i)

    for i in unsigned_list:
        hex_rep += str(i)

    for i in unsigned_list:
        binary_rep += str(hex_dict[str(i)])
    if (len(binary_rep)>32):
        print("Bigger than 4 byte.")
        exit()
    powerCase = len(binary_rep) - 1
    for i in binary_rep:
        decimalValue += int(i)*(2**powerCase)
        powerCase -= 1

    print("{}, in binary: {}".format(hex_rep,binary_rep))
    print("The printed value will be: {}".format(decimalValue))

def singed_value(given_number):
    binary_rep = ""
    hex_rep = ""
    singned_list = []
    decimalValue = 0

    for i in given_number:
        if (i not in hex_dict.keys()):
            print("Wrong hexadecimal value please enter a valid hexadecimal value...")
            exit()
        else:
            continue

    if len(given_number) % 2 == 0:
        for i in given_number:
            singned_list.append(i)
    else:
        singned_list.append(0)
        for i in given_number:
            singned_list.append(i)

    for i in singned_list:
        hex_rep += str(i)

    for i in singned_list:
        binary_rep += str(hex_dict[str(i)])
    if (len(binary_rep)>32):
        print("Bigger than 4 byte.")
        exit()

    powerCase = len(binary_rep) - 1
    signedPowerCase = len(binary_rep)-1
    for i in binary_rep:
        # print(powerCase)
        # print("----------")
        # print(i)
        if powerCase == signedPowerCase:
            decimalValue += int(i) * (-2 ** powerCase)
        else:
            decimalValue += int(i) * (2 ** powerCase)

        powerCase -= 1

    print("{}, in binary: {}".format(hex_rep, binary_rep))
    print("The printed value will be: {}".format(decimalValue))


def floatingPointValue(given_number):
    binary_rep = ""
    hex_rep = ""
    floating_list = []
    decimalValue = 0

    for i in given_number:
        if (i not in hex_dict.keys()):
            print("Wrong hexadecimal value please enter a valid hexadecimal value...")
            exit()
        else:
            continue

    if len(given_number) % 2 == 0:
        for i in given_number:
            floating_list.append(i)
    else:
        floating_list.append(0)
        for i in given_number:
            floating_list.append(i)

    for i in floating_list:
        hex_rep += str(i)

    for i in floating_list:
        binary_rep += str(hex_dict[str(i)])
    if (len(binary_rep)>32):
        print("Bigger than 4 byte.")
        exit()

    if len(binary_rep) == 8:
        print("Buraya girdi")
        signedBit = binary_rep[0]
        exponentValue = binary_rep[1:11]
        fraction = binary_rep[11:]
        this_mantissa = (2 ** 9) - 1
        exponentValueToDecValue = 0
    elif len(binary_rep) == 16:
        print("Buraya girdi")
    elif len(binary_rep) == 24:
        print("Buraya girdi")
    elif len(binary_rep) == 32:
        print("Buraya girdi")
        signedBit = binary_rep[0]
        exponentValue = binary_rep[1:11]
        fraction = binary_rep[11:]
        this_mantissa = (2**9)-1
        exponentValueToDecValue = 0
        decimalExponent = 0

        expPowerCase = len(exponentValue)-1
        for i in exponentValue:
            exponentValueToDecValue += int(i)*(2**expPowerCase)
            expPowerCase -= 1

        if (fraction[13]=="1" and fraction[14] == "1" and fraction[15]=="1"):
            print("Burasi dogru")
        else:
            fractionList = []
            fractionVal = fraction[0:13]
            newFraction = ""
            for i in fractionVal:
                fractionList.append(i)
            if fractionVal[0] == "1":
                fractionList.insert(0,"0")
            elif fractionVal[0] == "0":
                fractionList.insert(0, "1")
            for i in fractionList:
                newFraction += str(i)

            mantissaValPower = 0
            mantissaDecNum = 0
            for i in newFraction:
                mantissaDecNum += int(i)*(2**mantissaValPower)
                mantissaValPower -= 1


            print(mantissaDecNum)
            if exponentValue == "0000000000":
                decimalExponent += ((-1)**int(signedBit))*(mantissaDecNum)*(2**(1-this_mantissa))
            else:
                decimalExponent += ((-1)**int(signedBit))*(mantissaDecNum)*(2**(exponentValueToDecValue-this_mantissa))


        print("{}, in binary: {}".format(hex_rep, binary_rep))
        print("Sign bit = {}".format(signedBit))
        print("Exponent = {}".format(exponentValue))
        print("Fraction = {}".format(fraction))
        print(f"Decimal Value: {decimalExponent:6g}")









unsigned_value("836BA")
print("-------------------------------")
singed_value("FF23")
print("-------------------------------")
floatingPointValue("40019020")

