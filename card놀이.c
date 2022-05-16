#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	int card1[8] = { 1, 2, 3, 4, 5, 6 ,7,8 }; //ÀüÃ¼¼öÁß Àý¹Ý
	int card2[8] = { 1, 2, 3, 4, 9, 10 ,11,12 };//4°³¾¿ ¹­À½
	int card3[8] = { 1, 2, 5, 6, 9, 10 ,13,14 };//È¦Â¦ 2°³¾¿ ¹­À½ 
	int card4[8] = { 1, 3, 5, 7, 9, 11,13,15 };//È¦Â¦ ±¸º°

	char choice[5];
	int select[16]={0};
	int count, i;
	int maxIndex = 0;

	for (i = 0; i < 4; i++) 
		scanf("%c", &choice[i]);
	
	count = 0;
	while (count < 4) {
		switch (count) {
		case 0:
			if (choice[count] == 'Y') {
				for (i = 0; i < 8; i++)
					select[i]++;
			}
			else {
				for (i = 0; i < 8; i++)
					select[8 + i]++;
			}
			break;
		case 1:
			if (choice[count] == 'Y') {
				for (i = 0; i < 4; i++) {
					select[i]++;
					select[8 + i]++;
				}
			}
			else {
				for (i = 0; i < 4; i++) {
					select[4 + i]++;
					select[12 + i]++;
				}
			}
			break;
		case 2:
			if (choice[count] == 'Y') {
				for (i = 0; i < 4; i++) {
					select[i * 4]++;
					select[i * 4 + 1]++;
				}
			}
			else {
				for (i = 0; i < 4; i++) {
					select[i * 4 + 2]++;
					select[i * 4 + 3]++;
				}
			}
			break;
		case 3:
			if (choice[count] == 'Y') {
				for (i = 0; i < 8; i++)
					select[i * 2]++;
			}
			else {
				for (i = 0; i < 8; i++)
					select[i * 2 + 1]++;
			}
			break;
		}
		count++;
	}

	for (i = 0; i < 15; i++) {
		if (select[maxIndex] <= select[i])
			maxIndex = i;
	}
	printf("%d", maxIndex + 1);
}