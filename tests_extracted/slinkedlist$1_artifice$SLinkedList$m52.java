public SLinkedList m52(SLinkedList v14){
    SLinkedList v15;
    v15 = v14;
    SLinkedList v16;
    v16 = null;
    for (; true; ) {
        if (v15 == null) {
            return v16;
        }
        SLinkedList v17;
        v17 = new SLinkedList(v15.f02);
        v17.f12 = v16;
        v16 = v17;
        v15 = v15.f12;
    }
}