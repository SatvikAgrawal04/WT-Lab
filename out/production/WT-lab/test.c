#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main()
{
    int fd[2];
    char writing[20];
    strcpy(writing, "Hello");
    char reading[20];
    pipe(fd);
    int pid1 = fork();
    if (pid1 != 0)
    {
        int pid2 = fork();
        if (pid2 != 0)
        {

            close(fd[0]);
            wait(NULL);
            printf("In parent (p1) - writing to pipe - %s\n", writing);
            write(fd[1], writing, strlen(writing) + 1);
        }
        else
        {

            close(fd[1]);
            wait(NULL);
            read(fd[0], reading, sizeof(reading));
            printf("In child 2 (p3) - reading from pipe - %s\n", reading);
        }
    }
    else
    {

        close(fd[1]);
        read(fd[0], reading, sizeof(reading));
        printf("In child 1 (p2) - reading from pipe - %s\n", reading);
    }
    return 0;
}