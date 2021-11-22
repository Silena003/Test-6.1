public class BonusService {
    public long calculate(long amount, boolean registered) {

        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
        public long newData(long amount, boolean notregistered) {

            int percent2 = notregistered ? 1 : 3;
            long bonus2 = amount * percent2 / 100 / 100;
            long limit2 = 500;
            if (bonus2 > limit2) {
                bonus2 = limit2;
            }
            return bonus2;


        }
    }
