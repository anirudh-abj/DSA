struct Stack:
    List[Int] stack

    Stack():
        stack = List[Int]()
    
    fn push(self, Int data) -> None:
        self.stack.append(data)

    fn pop(self) -> Int:
        return self.stack.pop()

    fn size(self) -> Int:
        return len(self.stack)

    