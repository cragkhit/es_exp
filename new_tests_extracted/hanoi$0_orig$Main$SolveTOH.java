public static int SolveTOH(int nDiscs, Stack source, Stack temp, Stack dest){
    if (nDiscs <= 4) {
        if ((nDiscs % 2) == 0) {
            Solve2DiscsTOH(source, temp, dest);
            nDiscs = nDiscs - 1;
            if (nDiscs == 1) {
                return 1;
            }
            temp.push(source.pop());
            movecount++;
            PrintStacks();
            Solve2DiscsTOH(dest, source, temp);
            dest.push(source.pop());
            movecount++;
            PrintStacks();
            SolveTOH(nDiscs, temp, source, dest);
        } else {
            if (nDiscs == 1) {
                return -1;
            }
            Solve2DiscsTOH(source, dest, temp);
            nDiscs = nDiscs - 1;
            dest.push(source.pop());
            movecount++;
            PrintStacks();
            Solve2DiscsTOH(temp, source, dest);
        }
        return 1;
    } else if (nDiscs >= 5) {
        SolveTOH(nDiscs - 2, source, temp, dest);
        temp.push(source.pop());
        movecount++;
        PrintStacks();
        SolveTOH(nDiscs - 2, dest, source, temp);
        dest.push(source.pop());
        movecount++;
        PrintStacks();
        SolveTOH(nDiscs - 1, temp, source, dest);
    }
    return 1;
}