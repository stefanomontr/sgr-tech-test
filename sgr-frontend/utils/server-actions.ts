"use server";

import SgrEntity from "@/data/SgrEntity";
import fetchFromBackendApi from "./fetch-utils";

export async function createSgrEntity(sgrEntity: SgrEntity): Promise<SgrEntity> {
    return fetchFromBackendApi<SgrEntity>("/sgr/create", { 
        method: "POST", 
        body: JSON.stringify(sgrEntity),
        headers: new Headers({
            "Content-Type": "application/json"
        })
    });
}