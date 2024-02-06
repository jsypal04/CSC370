class Run_Length_Encode:     

    def encode(input_str):
        output = ""
        q = []

        for char in input_str:
            if len(q) == 0 or char == q[0]:
                q.append(char)
            elif len(q) <= 4 and q[0] != char:
                while len(q) > 0:
                    output += q.pop(0)
                q.append(char)
            elif len(q) > 4 and q[0] != char:
                output += "/" + "%02d" % len(q) + q.pop(0)
                while len(q) > 0:
                    q.pop(0)
                q.append(char)

        if len(q) <= 4:
            while len(q) > 0:
                output += q.pop(0)
        else:
            output += "/" + "%02d" % len(q) + q.pop(0)

        return output
    

if __name__ == "__main__":
    print(Run_Length_Encode.encode("aaaaa"))
    print(Run_Length_Encode.encode("aaaa"))
    print(Run_Length_Encode.encode("abcabcabcabcabc"))
    print(Run_Length_Encode.encode("if(a){if(b){if(c){if(d){if(e){5 deeeeeeep}}}}}"))
    print(Run_Length_Encode.encode(""))

                