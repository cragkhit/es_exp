public SLinkedList m32(SLinkedList v6){
    SLinkedList v7;
    v7 = null;
    if (v6 == null) {
        return v6;
    }
    for (; true; ) {
        SLinkedList v8;
        v8 = v6;
        if (v8.f12 == v7) {
            break;
        }
        for (; true; ) {
            int v9;
            v9 = v8.f02;
            v8.f02 = v8.f12.f02;
            v8.f12.f02 = v9;
            v8 = v8.f12;
            if (v8.f12 == v7) {
                v7 = v8;
                break;
            }
        }
    }
    return v6;
}