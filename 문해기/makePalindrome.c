#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main(void)
{
	char s[100];
	int i, j;
	int inputLen;
	int len;
	scanf("%s", s);
	inputLen = strlen(s);

	i = inputLen;
	while (1)
	{
		i++;
		len = i / 2;

		if (i % 2 == 0) {
			for (j = 0; j < len; j++) {
				if (len + j >= inputLen)
					s[len + j] = s[len - 1 - j];
				if (s[len - 1 - j] != s[len + j])
					break;
			}
		}
		else
		{
			for (j = 0; j < len; j++) {
				if (len + 1 + j >= inputLen)
					s[len + 1 + j] = s[len - 1 - j];
				if (s[len - 1 - j] != s[len + 1 + j])
					break;
			}
		}

		if (j == len) {
			s[i] = '\0';
			break;
		}
	}
	printf("%s", s);
}
