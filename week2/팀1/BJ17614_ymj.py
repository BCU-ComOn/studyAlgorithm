if __name__ == "__main__":
	clap = 0
	num = input()
	inum = int(num);
	snum = "0"
	for i in range(3,inum + 1):
		snum = str(i)
		for j in range(0, len(snum)):
			if snum[j] == "3" or snum[j] == "6" or snum[j] == "9":
				clap += 1
	print(clap)
