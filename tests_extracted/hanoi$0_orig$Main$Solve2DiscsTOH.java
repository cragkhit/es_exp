public static void Solve2DiscsTOH(Stack source, Stack temp, Stack dest){
    temp.push(source.pop());
    movecount++;
    PrintStacks();
    dest.push(source.pop());
    movecount++;
    PrintStacks();
    dest.push(temp.pop());
    movecount++;
    PrintStacks();
}