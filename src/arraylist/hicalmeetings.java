package arraylist;

import arraylist.model.Meeting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class hicalmeetings {
    private static List<Meeting> meetingList = new ArrayList<>() ;
    static {
        meetingList.add( new Meeting(3,5));
        meetingList.add( new Meeting(1,5));
        meetingList.add( new Meeting(6,88));
        meetingList.add( new Meeting(2,3));
    }

    public static List<Meeting> getMergedRanges(List<Meeting> meetings) {
//        meetings.sort(new Comparator<Meeting>() {
//            @Override
//            public int compare(Meeting meeting, Meeting t1) {
//                return t1.getStartTime().compareTo(meeting.getStartTime());
//            }
//        });
//        meetings.sort(Comparator.comparingInt(Meeting::getStartTime));
        meetings.sort((a,b) -> a.getStartTime()- b.getStartTime());
        List<Meeting> mergedMeetings = new ArrayList<>();

        for( Meeting meeting: meetings){
            if(mergedMeetings.isEmpty()){
                mergedMeetings.add(meetings.get(0));

            } else if (meeting.getStartTime() > mergedMeetings.get(mergedMeetings.size()-1).getEndTime()) {
                mergedMeetings.add(meeting);

            }

            else if(meeting.getEndTime() > mergedMeetings.get(mergedMeetings.size()-1).getEndTime()){
                mergedMeetings.get(mergedMeetings.size()-1).setEndTime(meeting.getEndTime());
            }
        }

        return  mergedMeetings;
    }

    public static void main(String[] args) {
        System.out.println(getMergedRanges(meetingList));
    }
}
