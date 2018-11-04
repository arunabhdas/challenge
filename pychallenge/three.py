# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")
import csv
def solution(S):
    # write your code in Python 3.6
    # rows = []
    alltimeslots = []
    alltimeslotintegers = []
    alltimesections = []
    alltimesectionswithdaynum = []
    sleeptime = 0
    rows = S.split("\n")

  
    for row in rows:
        #print(row)
        allsections = row.split(" ")
        daysections = row.split(" ")[-2:]
        timesections = row.split(" ")[-1:]
        # timesectionfirst = timesections.split("-")[0]
        timesectionfirst = [rectimesectionfirst.split("-")[0] for rectimesectionfirst in timesections]
        timesectionfirstint = [recfirst.split(":")[0] for recfirst in timesectionfirst]        
        # timesectionsecond = timesections.split("-")[1]
        timesectionsecond = [rectimesectionsecond.split("-")[1] for rectimesectionsecond in timesections]
        timesectionsecondint = [recsecond.split(":")[0] for recsecond in timesectionsecond]
        #timesectionfirstint = int(timesectionfirst.split(":")[0])
        
        #timesectionsecondint = int(timesectionsecond.split(":")[1])
        
        
        alltimesections.append(timesectionfirstint)
        alltimesections.append(timesectionsecondint)   
       
        #for daysection in daysections:
            # print(day_to_num(daysection))
            
            #alltimesections.append(timesectionfirst)
            #alltimesections.append(timesectionsecond)            
            
    #for timesection in alltimesections:
        #print(timesection)
        #print("--------------")
        #timeslots = timesection.split("-")
    daynum = 0    
    i = 0  
    while i < len(alltimesections): 
        timesec = (alltimesections[i])
        #print(timesec)
        # print("--------------")
        
        if (i % 2 == 0): 
            daynum += 1
        alltimesectionswithdaynum.append(timesec * daynum)
        if (i+1 < len(alltimesections)):
            sleeptime = (alltimesectionswithdaynum[i+1] - alltimesectionswithdaynum[i]) * 60
            
        i += 1
        
    return sleeptime  
    
def day_to_num(argument):
    switcher = {
        'Sun': 0,
        'Mon': 1,
        'Tue': 2,
        'Wed': 3,
        'Thu': 4,
        'Fri': 5,
        'Sat': 6
    }
    return switcher.get(argument, "Sun")